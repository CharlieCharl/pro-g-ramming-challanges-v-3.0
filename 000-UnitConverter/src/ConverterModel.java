public class ConverterModel {

    private double inputData;
    private int fromIndex;
    private int toIndex;

    public double convertLength(){
        if(fromIndex == 0 && toIndex == 0)
            return inputData;
        if(fromIndex == 0 && toIndex == 1)
            return inputData/1000;
        if(fromIndex == 0 && toIndex == 2)
            return inputData * 100;
        if(fromIndex == 0 && toIndex == 3)
            return inputData * 1000;
        if(fromIndex == 0 && toIndex == 4)
            return inputData * 1000000;
        if(fromIndex == 0 && toIndex == 5)
            return inputData * 1000000000;
        if(fromIndex == 0 && toIndex == 6)
            return inputData * 0.000621371192;
        if(fromIndex == 0 && toIndex == 7)
            return inputData * 1.0936133;
        if(fromIndex == 0 && toIndex == 8)
            return inputData * 3.2808399;
        if(fromIndex == 0 && toIndex == 9)
            return inputData * 39.3700787;
        if(fromIndex == 0 && toIndex == 10)
            return inputData * 1.05702341 * Math.pow(10,-16);

        if(fromIndex == 1 && toIndex == 0)
            return inputData * 1000;
        if(fromIndex == 1 && toIndex == 1)
            return inputData;
        if(fromIndex == 1 && toIndex == 2)
            return inputData * 100000;
        if(fromIndex == 1 && toIndex == 3)
            return inputData * 1000000;
        if(fromIndex == 1 && toIndex == 4)
            return inputData * 1000000000;
        if(fromIndex == 1 && toIndex == 5)
            return inputData * Math.pow(10,11);
        if(fromIndex == 1 && toIndex == 6)
            return inputData * 0.621371192;
        if(fromIndex == 1 && toIndex == 7)
            return inputData * 1093.6133;
        if(fromIndex == 1 && toIndex == 8)
            return inputData * 3280.8399;
        if(fromIndex == 1 && toIndex == 9)
            return inputData * 39370.0787;
        if(fromIndex == 1 && toIndex == 10)
            return inputData * 1.05702341 * Math.pow(10,-13);

        if(fromIndex == 2 && toIndex == 0)
            return inputData * 100;
        if(fromIndex == 2 && toIndex == 1)
            return inputData *  Math.pow(10,-5);
        if(fromIndex == 2 && toIndex == 2)
            return inputData;
        if(fromIndex == 2 && toIndex == 3)
            return inputData * 10;
        if(fromIndex == 2 && toIndex == 4)
            return inputData * 10000;
        if(fromIndex == 2 && toIndex == 5)
            return inputData * Math.pow(10,6);
        if(fromIndex == 2 && toIndex == 6)
            return inputData * 0.621371192 * Math.pow(10,-6);
        if(fromIndex == 2 && toIndex == 7)
            return inputData * 0.010936133;
        if(fromIndex == 2 && toIndex == 8)
            return inputData * 0.032808399;
        if(fromIndex == 2 && toIndex == 9)
            return inputData * 0.393700787;
        if(fromIndex == 2 && toIndex == 10)
            return inputData * 1.05702341 * Math.pow(10,-18);

        if(fromIndex == 3 && toIndex == 0)
            return inputData * 0.001;
        if(fromIndex == 3 && toIndex == 1)
            return inputData *  Math.pow(10,-6);
        if(fromIndex == 3 && toIndex == 2)
            return inputData * 0.1;
        if(fromIndex == 3 && toIndex == 3)
            return inputData;
        if(fromIndex == 3 && toIndex == 4)
            return inputData * 1000;
        if(fromIndex == 3 && toIndex == 5)
            return inputData * Math.pow(10,6);
        if(fromIndex == 3 && toIndex == 6)
            return inputData * 0.621371192 * Math.pow(10,-7);
        if(fromIndex == 3 && toIndex == 7)
            return inputData * 0.0010936133;
        if(fromIndex == 3 && toIndex == 8)
            return inputData * 0.0032808399;
        if(fromIndex == 3 && toIndex == 9)
            return inputData * 0.0393700787;
        if(fromIndex == 3 && toIndex == 10)
            return inputData * 1.05702341 * Math.pow(10,-19);

        if(fromIndex == 4 && toIndex == 0)
            return inputData *  Math.pow(10,-6);
        if(fromIndex == 4 && toIndex == 1)
            return inputData *  Math.pow(10,-9);
        if(fromIndex == 4 && toIndex == 2)
            return inputData * 0.0001;
        if(fromIndex == 4 && toIndex == 3)
            return inputData * 0.001;
        if(fromIndex == 4 && toIndex == 4)
            return inputData;
        if(fromIndex == 4 && toIndex == 5)
            return inputData * 1000;
        if(fromIndex == 4 && toIndex == 6)
            return inputData * 6.21371192 * Math.pow(10,-10);
        if(fromIndex == 4 && toIndex == 7)
            return inputData * 1.0936133 * Math.pow(10,-6);
        if(fromIndex == 4 && toIndex == 8)
            return inputData * 3.2808399 * Math.pow(10,-6);
        if(fromIndex == 4 && toIndex == 9)
            return inputData * 3.93700787 * Math.pow(10,-5);
        if(fromIndex == 4 && toIndex == 10)
            return inputData * 1.05702341 * Math.pow(10,-22);

        if(fromIndex == 5 && toIndex == 0)
            return inputData *  Math.pow(10,-9);
        if(fromIndex == 5 && toIndex == 1)
            return inputData *  Math.pow(10,-12);
        if(fromIndex == 5 && toIndex == 2)
            return inputData * Math.pow(10,-7);
        if(fromIndex == 5 && toIndex == 3)
            return inputData * Math.pow(10,-6);
        if(fromIndex == 5 && toIndex == 4)
            return inputData * 0.001;
        if(fromIndex == 5 && toIndex == 5)
            return inputData ;
        if(fromIndex == 5 && toIndex == 6)
            return inputData * 6.21371192 * Math.pow(10,-13);
        if(fromIndex == 5 && toIndex == 7)
            return inputData * 1.0936133 * Math.pow(10,-9);
        if(fromIndex == 5 && toIndex == 8)
            return inputData * 3.2808399 * Math.pow(10,-9);
        if(fromIndex == 5 && toIndex == 9)
            return inputData * 3.93700787 * Math.pow(10,-8);
        if(fromIndex == 5 && toIndex == 10)
            return inputData * 1.05702341 * Math.pow(10,-25);

        if(fromIndex == 6 && toIndex == 0)
            return inputData *  1609.344;
        if(fromIndex == 6 && toIndex == 1)
            return inputData *  1.609344;
        if(fromIndex == 6 && toIndex == 2)
            return inputData * 160934.4;
        if(fromIndex == 6 && toIndex == 3)
            return inputData * 1609344;
        if(fromIndex == 6 && toIndex == 4)
            return inputData * 1609344000;
        if(fromIndex == 6 && toIndex == 5)
            return inputData * 1.609344000000 * Math.pow(10,12);
        if(fromIndex == 6 && toIndex == 6)
            return inputData;
        if(fromIndex == 6 && toIndex == 7)
            return inputData * 1760;
        if(fromIndex == 6 && toIndex == 8)
            return inputData * 5280;
        if(fromIndex == 6 && toIndex == 9)
            return inputData * 63360;
        if(fromIndex == 6 && toIndex == 10)
            return inputData * 1.70111428 * Math.pow(10,-13);

        if(fromIndex == 7 && toIndex == 0)
            return inputData *  0.9144 ;
        if(fromIndex == 7 && toIndex == 1)
            return inputData *  0.0009144;
        if(fromIndex == 7 && toIndex == 2)
            return inputData * 91.44;
        if(fromIndex == 7 && toIndex == 3)
            return inputData * 914.4;
        if(fromIndex == 7 && toIndex == 4)
            return inputData * 914400;
        if(fromIndex == 7 && toIndex == 5)
            return inputData * 914400000;
        if(fromIndex == 7 && toIndex == 6)
            return inputData * 0.000568181818;
        if(fromIndex == 7 && toIndex == 7)
            return inputData;
        if(fromIndex == 7 && toIndex == 8)
            return inputData * 3;
        if(fromIndex == 7 && toIndex == 9)
            return inputData * 36;
        if(fromIndex == 7 && toIndex == 10)
            return inputData * 9.66542207 * Math.pow(10,-17);

        if(fromIndex == 8 && toIndex == 0)
            return inputData *  0.3048;
        if(fromIndex == 8 && toIndex == 1)
            return inputData *  0.0003048;
        if(fromIndex == 8 && toIndex == 2)
            return inputData * 30.48;
        if(fromIndex == 8 && toIndex == 3)
            return inputData * 304.8;
        if(fromIndex == 8 && toIndex == 4)
            return inputData * 304800;
        if(fromIndex == 8 && toIndex == 5)
            return inputData * 304800000;
        if(fromIndex == 8 && toIndex == 6)
            return inputData * 0.000189393939;
        if(fromIndex == 8 && toIndex == 7)
            return inputData * 0.333333333;
        if(fromIndex == 8 && toIndex == 8)
            return inputData;
        if(fromIndex == 8 && toIndex == 9)
            return inputData * 12;
        if(fromIndex == 8 && toIndex == 10)
            return inputData * 3.22180736 * Math.pow(10,-17);

        if(fromIndex == 9 && toIndex == 0)
            return inputData *  0.0254;
        if(fromIndex == 9 && toIndex == 1)
            return inputData *  2.54 * Math.pow(10,-5);
        if(fromIndex == 9 && toIndex == 2)
            return inputData * 2.54;
        if(fromIndex == 9 && toIndex == 3)
            return inputData * 25.4;
        if(fromIndex == 9 && toIndex == 4)
            return inputData * 25400;
        if(fromIndex == 9 && toIndex == 5)
            return inputData * 25400000;
        if(fromIndex == 9 && toIndex == 6)
            return inputData * 1.57828283 * Math.pow(10,-5);
        if(fromIndex == 9 && toIndex == 7)
            return inputData * 0.0277777778;
        if(fromIndex == 9 && toIndex == 8)
            return inputData * 0.0833333333;
        if(fromIndex == 9 && toIndex == 9)
            return inputData;
        if(fromIndex == 9 && toIndex == 10)
            return inputData * 2.68483946 * Math.pow(10,-18);

        if(fromIndex == 10 && toIndex == 0)
            return inputData *  9.4605284 * Math.pow(10,15);
        if(fromIndex == 10 && toIndex == 1)
            return inputData *  9.4605284 * Math.pow(10,12);
        if(fromIndex == 10 && toIndex == 2)
            return inputData *  9.4605284 * Math.pow(10,17);
        if(fromIndex == 10 && toIndex == 3)
            return inputData *  9.4605284 * Math.pow(10,18);
        if(fromIndex == 10 && toIndex == 4)
            return inputData *  9.4605284 * Math.pow(10,21);
        if(fromIndex == 10 && toIndex == 5)
            return inputData *  9.4605284 * Math.pow(10,24);
        if(fromIndex == 10 && toIndex == 6)
            return inputData * 5.87849981 * Math.pow(10,12);
        if(fromIndex == 10 && toIndex == 7)
            return inputData * 1.03461597 * Math.pow(10,16);
        if(fromIndex == 10 && toIndex == 8)
            return inputData * 3.1038479 * Math.pow(10,16);
        if(fromIndex == 10 && toIndex == 9)
            return inputData * 3.72461748 * Math.pow(10,17);
        if(fromIndex == 10 && toIndex == 10)
            return inputData;

        return inputData;
    }

    public double convertTemperature(){
        if(fromIndex == 0 && toIndex == 0)
            return inputData;
        if(fromIndex == 0 && toIndex == 1)
            return inputData + 273.15;
        if(fromIndex == 0 && toIndex == 2)
            return (inputData * 9/5) + 32;

        if(fromIndex == 1 && toIndex == 0)
            return inputData - 273.15;
        if(fromIndex == 1 && toIndex == 1)
            return inputData;
        if(fromIndex == 1 && toIndex == 2)
            return (inputData * 9/5) - 459.67;

        if(fromIndex == 2 && toIndex == 0)
            return (inputData - 32) * 5/9;
        if(fromIndex == 2 && toIndex == 1)
            return (inputData + 459.67) * 5/9;
        if(fromIndex == 2 && toIndex == 2)
            return inputData;

        return inputData;
    }

    public double convertWeight(){
        if(fromIndex == 0 && toIndex == 0)
            return inputData;
        if(fromIndex == 0 && toIndex == 1)
            return inputData * 1000;
        if(fromIndex == 0 && toIndex == 2)
            return inputData * 1000000;
        if(fromIndex == 0 && toIndex == 3)
            return inputData * 2.20462262;
        if(fromIndex == 0 && toIndex == 4)
            return inputData * 35.2739619;
        if(fromIndex == 0 && toIndex == 5)
            return inputData * 5000 ;

        if(fromIndex == 1 && toIndex == 0)
            return inputData * 0.001;
        if(fromIndex == 1 && toIndex == 1)
            return inputData;
        if(fromIndex == 1 && toIndex == 2)
            return inputData * 1000;
        if(fromIndex == 1 && toIndex == 3)
            return inputData * 0.00220462262;
        if(fromIndex == 1 && toIndex == 4)
            return inputData * 0.0352739619;
        if(fromIndex == 1 && toIndex == 5)
            return inputData * 5 ;

        if(fromIndex == 2 && toIndex == 0)
            return inputData * Math.pow(10,-6);
        if(fromIndex == 2 && toIndex == 1)
            return inputData * 0.001;
        if(fromIndex == 2 && toIndex == 2)
            return inputData;
        if(fromIndex == 2 && toIndex == 3)
            return inputData * 2.20462262 * Math.pow(10,-6);
        if(fromIndex == 2 && toIndex == 4)
            return inputData * 3.52739619 * Math.pow(10,-5);
        if(fromIndex == 2 && toIndex == 5)
            return inputData * 0.005;

        if(fromIndex == 3 && toIndex == 0)
            return inputData * 0.45359237;
        if(fromIndex == 3 && toIndex == 1)
            return inputData * 453.59237;
        if(fromIndex == 3 && toIndex == 2)
            return inputData * 453592.37;
        if(fromIndex == 3 && toIndex == 3)
            return inputData;
        if(fromIndex == 3 && toIndex == 4)
            return inputData * 16;
        if(fromIndex == 3 && toIndex == 5)
            return inputData * 2267.96185;

        if(fromIndex == 4 && toIndex == 0)
            return inputData * 0.0283495231;
        if(fromIndex == 4 && toIndex == 1)
            return inputData * 28.3495231;
        if(fromIndex == 4 && toIndex == 2)
            return inputData * 28349.5231;
        if(fromIndex == 4 && toIndex == 3)
            return inputData * 0.0625;
        if(fromIndex == 4 && toIndex == 4)
            return inputData;
        if(fromIndex == 4 && toIndex == 5)
            return inputData * 141.747616;

        if(fromIndex == 5 && toIndex == 0)
            return inputData * 0.0002;
        if(fromIndex == 5 && toIndex == 1)
            return inputData * 0.2;
        if(fromIndex == 5 && toIndex == 2)
            return inputData * 200 ;
        if(fromIndex == 5 && toIndex == 3)
            return inputData * 0.000440924524;
        if(fromIndex == 5 && toIndex == 4)
            return inputData * 0.00705479239;
        if(fromIndex == 5 && toIndex == 5)
            return inputData;

        return inputData;
    }

    public void setInputData(double inputData) {
        this.inputData = inputData;
    }

    public void setFromIndex(int fromIndex) {
        this.fromIndex = fromIndex;
    }

    public void setToIndex(int toIndex) {
        this.toIndex = toIndex;
    }
}
