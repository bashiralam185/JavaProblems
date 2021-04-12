class ResistorColor {

    public ResistorColor(){};

    public int colorCode(String color) {
        String[] array = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};
        int num;
        for ( num=0; num<9; num++){
            if (color.equals(array[num])){
                return num;
            }

        }
        return num;
    }

    public String[] colors() {
        String[] array = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};
        return array;
    }
}