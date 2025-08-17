package misc;

/*
    Used to restrict which other classes may directly extend your class
    sealed
    non-sealed
    permits
    Sealed classes must be declared in the same package
    Every listed subclass must extend sealed class
    every subclass must have one of the following modifiers
        final, sealed, non-sealed
 */
public sealed class SealedClassesCar permits Tata, Mahindra, AshokLeyland {
}

final class Tata extends SealedClassesCar {
    //canot be further extended
}

non-sealed class Mahindra extends SealedClassesCar {
    //can be extended by other car
}

sealed class AshokLeyland extends SealedClassesCar permits Truck {
}

final class Truck extends AshokLeyland {
}



