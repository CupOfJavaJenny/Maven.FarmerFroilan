package concreteclass;

import Abstract.Crop;
import Interface.Aircraft;
import Interface.Fertilize;
import Interface.Noisemaker;
import collections.CropRow;

public class CropDuster extends CropRow implements Aircraft, Noisemaker {

    @Override
    public boolean fly() {
        return true;
    }


    public boolean fertilize(CropRow<Crop> cropRowOne) {
        for (Crop crop: cropRowOne){
            System.out.println(crop + " has been fertilized");
        }
        return true;
    }

    public boolean hasPilot() {
        return false;
    }

    @Override
    public String makesNoise() {
        return "Noise";
    }
}
