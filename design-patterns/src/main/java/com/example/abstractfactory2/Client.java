package com.example.abstractfactory2;

import com.example.abstractfactory2.Instance.Capacity;
import com.example.abstractfactory2.aws.AwsResourceFactory;

public class Client {

    private ResourceFactory factory;

    public Client(ResourceFactory factory)
    {
        this.factory = factory;
    }

    public Instance createServer(Instance.Capacity cap,int storageMib)
    {
        Instance instance = factory.createInstance(cap);
        Storage storage = factory.createStorage(storageMib);
        instance.attachStorage(storage);
        return instance;
    }
    public static void main(String[] args) {
    	
        Client aws = new Client(new AwsResourceFactory());
        Instance i1 = aws.createServer(Capacity.micro, 20840);
        i1.start();
        i1.stop();

    }

}
