package ch07.sec07.poly;

public class AnimalExample {
    public static void main(String[] args) {
        //Animal animal = new Animal();
        Cat cat = new Cat();
        Tiger tiger = new Tiger();
        Cow cow = new Cow();
        Dog dog = new Dog();
        BullDog bullDog = new BullDog();

        animalCrying(cat);
        animalCrying(tiger);
        animalCrying(cow);
        animalCrying(dog);
        animalCrying(bullDog);
        //월~ 월~
        //불독이 쩜프 쩜프
    }

    public static void animalCrying(Animal animal) {
        animal.crying();
        //Dog객체 넘어오면 jump 메소드 호출해주세요.
        //1. jump() 메소드를 호출하려면 타입이 Dog가 되어야 한다.
        //2. Dog객체가 들어왔을 때만 Dog타입으로 형변환을 해야한다.

        if(animal instanceof Dog) {
            Dog dog = (Dog)animal;
            dog.jump();
        }

    }

//    public static void animalCrying(Cat cat) { cat.crying(); }
//    public static void animalCrying(Tiger tiger) { tiger.crying(); }
//    public static void animalCrying(Cow cow) { cow.crying(); }
}
