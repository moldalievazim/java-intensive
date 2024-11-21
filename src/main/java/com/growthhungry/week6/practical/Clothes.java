package com.growthhungry.week6.practical;

class Clothes {
    private String size;
    private String material;

    public Clothes(String size, String material) {
        this.size = size;
        this.material = material;
    }

    @Override
    public String toString() {
        return "Size: " + size + ", Material: " + material;
    }

}
