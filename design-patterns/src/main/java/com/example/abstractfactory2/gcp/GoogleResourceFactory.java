package com.example.abstractfactory2.gcp;

import com.example.abstractfactory2.Instance;
import com.example.abstractfactory2.Instance.Capacity;
import com.example.abstractfactory2.ResourceFactory;
import com.example.abstractfactory2.Storage;

//Factory implementation for Google cloud platform resources
public class GoogleResourceFactory implements ResourceFactory {

    @Override
    public Instance createInstance(Capacity capacity) {
       return new GoogleComputeEngineInstance(capacity);
    }

    @Override
    public Storage createStorage(int capMib) {
        return new GoogleCloudStorage(capMib);
    }


}
