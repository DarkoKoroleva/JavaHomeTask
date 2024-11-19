package LogicBlock;

public class Main {
    public static void main(String[] args) {
        new A(100);
    }
}

//static logic - The static block is executed first when the class is loaded for the first time
//logic (1) id= 0 - Instance initialization blocks are executed before the constructor,
//logic (2) id= 1 - even if the variables have not yet been initialized
//ctor id= 100 - The c-tor is executed last and can overwrite the values of the fields set in the initialization blocks
