public class ConverterModel {

    private double inputData;
    private int fromIndex;
    private int toIndex;
    private double result;

    public double convertLegnht(){

        if(fromIndex == 0 && toIndex == 0)
            return inputData;
        if(fromIndex == 0 && toIndex == 1)
            result = inputData/1000;
        if(fromIndex == 0 && toIndex == 2)
            result = inputData * 100;
        if(fromIndex == 0 && toIndex == 3)
            result = inputData * 1000;
        if(fromIndex == 0 && toIndex == 4)
            result = inputData * 1000000;
        if(fromIndex == 0 && toIndex == 5)
            result = inputData * 1000000000;
        if(fromIndex == 0 && toIndex == 6)
            result = inputData * 0.000621371192;
        if(fromIndex == 0 && toIndex == 7)
            result = inputData * 1.0936133;
        if(fromIndex == 0 && toIndex == 8)
            result = inputData * 3.2808399;
        if(fromIndex == 0 && toIndex == 9)
            result = inputData * 39.3700787;
        if(fromIndex == 0 && toIndex == 10)
            result = inputData * 1.05702341 * Math.pow(10,-16);

        return result;
    }


    public double getInputData() {
        return inputData;
    }

    public int getFromIndex() {
        return fromIndex;
    }

    public int getToIndex() {
        return toIndex;
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
