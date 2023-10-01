public class Counter {
    private int count; // use to store an integer value
    private String name; // use to store a string

    // Counter class constructor with a string parameter
    public Counter(String namePara) {
        name = namePara;
        count = 0;
    }

    // Increment method to increase the object's _count field by one
    public void Increment() {
        count++; // _count field increased by one
    }

    // Reset method to set the object's _count field to 0
    public void Reset() {
        count = 0; // change _count field to 0
    }

    // initialis Name property
    public String GetName() {
        return this.name; // return the value from the _name field
    }

    // initialis Value property
    public int GetValue() {
        return count; // return the value from the _count field
    }

    public void SetValue(int value) {
        this.count = value;
    }
}
