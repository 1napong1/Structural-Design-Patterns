package edu.parinya.softarchdesign.structural;
// Please DO NOT MODIFY THIS FILE


public class Nurse extends HealthcareWorker {
    public Nurse(String name, double price) {
        super(name, price);
    }

    @Override
    public void service() {
        System.out.println(this.getName() + " assists other healthcare professionals.");
    }
}
