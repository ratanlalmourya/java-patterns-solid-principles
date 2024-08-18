package object_adapter_pattern;

import object_adapter_pattern.adapters.SquarePegAdapter;
import object_adapter_pattern.round.RoundHole;
import object_adapter_pattern.round.RoundPeg;
import object_adapter_pattern.square.SquarePeg;

public class Main {
    public static void main(String[] args) {
        
        RoundHole hole = new RoundHole(5);
        RoundPeg rpeg = new RoundPeg(5);

        if(hole.fits(rpeg)) {
            System.out.println("Round peg r5 fits round hole r5.");
        }

        SquarePeg smallSqPeg = new SquarePeg(2);
        SquarePeg largeSqPeg = new SquarePeg(20);

        SquarePegAdapter smallPegAdapter = new SquarePegAdapter(smallSqPeg);
        SquarePegAdapter largePegAdapter = new SquarePegAdapter(largeSqPeg);

        if(hole.fits(smallPegAdapter)) 
            System.out.println("Square peg w2 fits round hole r5.");
        }

        if(!hole.fits(largePegAdapter)) {
            System.out.println("Square peg w20 does not fit into round hole r5.");
        }

    }
}