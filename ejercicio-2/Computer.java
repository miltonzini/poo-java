// import java.util.Objects;

import java.util.Objects;

public class Computer {
    // ...

    // marca
    private String brand;
    private String model;
    private int memory;
    private int disk;
    private int usedSpaceInDisk;
    private boolean isOn;

    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMemory() {
        return this.memory;
    }

    public void setMemory(int memory) {
        if (!isPowerOfTwo(memory)) {
            throw new IllegalArgumentException("La RAM no es potencia de 2.");
        }
        this.memory = memory;
    }

    public int getDisk() {
        return this.disk;
    }

    public void setDisk(int disk) {
        this.disk = disk;
    }

    public int getUsedSpaceInDisk() {
        return this.usedSpaceInDisk;
    }

    public void setUsedSpaceInDisk(int usedSpaceInDisk) {
        this.usedSpaceInDisk = usedSpaceInDisk;
    }

    public boolean isOn() {
        return this.isOn;
    }

    public void setOn(boolean isOn) {
        this.isOn = isOn;
    }
    public Computer() {
        this("", "", 4, 50);
    }
    public Computer(int memory) {
        this("", "", memory, 50);
    }
    public Computer(int memory, int disk) {
        this("", "", memory, disk);
    }
    public Computer(String brand, String model, int memory, int disk) {

        if(!isPowerOfTwo(memory)) {
            throw new IllegalArgumentException("La RAM no es potencia de 2.");
        }

        this.brand = brand;
        this.model = model;
        this.memory = memory;
        this.disk = disk;
    }

    private boolean isPowerOfTwo(int number) {
        if(number <= 0) {
            return false;
        }

        double logBase2 = Math.log(number) / Math.log(2);
        return logBase2 == (int) logBase2;
    }
    

    public void turnOn() {
        if(this.isOn) {
            System.out.println("La computadora ya se encuentra encendida.");
        } else {
            this.isOn = true;
            System.out.println("La computadora se ha encendido.");
            
        }
    }

    public void turnOff() {
        if (this.isOn) {
            this.isOn = false;
            System.out.println("La computadora se ha apagado");            
        } else {
            System.out.println("La computadora ya se encuentra apagada");
        }
    }

    public void transferData(int dataSize) {
        if (this.isOn) {
            if(this.usedSpaceInDisk + dataSize <= disk) {
                this.usedSpaceInDisk += dataSize;
                System.out.println("Transferidos " + dataSize + " GB. Espacio actual utilizado: " + this.usedSpaceInDisk + " GB.");
            } else {
                System.out.println("No hay espacio suficiente para hacer esa transferencia.");
            }
        } else {
            System.out.println("La computadora se encuentra apagada");
        }
    }

    public void deleteFiles(int dataSize) {
        if (this.isOn) {
            if (this.usedSpaceInDisk - dataSize < 0) {
                this.usedSpaceInDisk = 0;
            } else {
                this.usedSpaceInDisk -= dataSize;
            }

            System.out.println("Se han eliminado " + dataSize + " GB. Espacio actual utilizado: " + this.usedSpaceInDisk + "GB.");
        } else {
            System.out.println("La computadora se encuentra apagada");
        }
    }

    // EQUALS.
    // Un ordenador será igual a otro si coinciden marca y modelo
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.brand);
        hash = 59 * hash + Objects.hashCode(this.model);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) {
            return true;
        }
        if(obj == null) {
            return false;
        }
        if(getClass() != obj.getClass()) {
            return false;
        }
        final Computer other = (Computer) obj;

        if(!Objects.equals(this.brand, other.brand)) {
            return false;
        }
        return Objects.equals(this.model, other.model);
    }

    public String toString() {
        
        String status = "Apagada";
        if(this.isOn) {
            status = "Encendida";
        }
        return "Computadora(" + brand + " " + model + "). Estado: " + status;
    }





}