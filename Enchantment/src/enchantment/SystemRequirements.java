/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enchantment;

/**
 *
 * @author User
 */
public class SystemRequirements {
    
    private double CPU;
    private int GPU;
    private int RAM;

    public SystemRequirements()
    {
        this.CPU=0;
        this.GPU=0;
        this.RAM=0;
        
    }
    public SystemRequirements(double CPU, int GPU, int RAM) {
        this.CPU = CPU;
        this.GPU = GPU;
        this.RAM = RAM;
    }

    public double getCPU() {
        return CPU;
    }

    public int getGPU() {
        return GPU;
    }

    public int getRAM() {
        return RAM;
    }

    public void setCPU(double CPU) {
        this.CPU = CPU;
    }

    public void setGPU(int GPU) {
        this.GPU = GPU;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

    @Override
    public String toString() {
        return "SystemRequirements{" 
                + "\nCPU=" + CPU + 
                ",\n GPU=" + GPU + 
                ",\n RAM=" + RAM + '}';
    }
    
    
    
}
