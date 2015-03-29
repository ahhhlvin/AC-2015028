package nyc.c4q.ahhhlvin;

public class Main {

    public static void main(String[] args) {

        Dogs dog0 = new Dogs("dog1", "boo", 13);
        Dogs dog1 = new Dogs("sport", "terrier", 3);
        Dogs dog2 = new Dogs("missy", "maltese", 2);
        Dogs dog3 = new Dogs("max", "yorkie", 4);
        Dogs dog4 = new Dogs("sleepy", "labrador", 6);
        Dogs dog5 = new Dogs("sport", "husky", 7);
        Kennel ourKennel = new Kennel();

        ourKennel.addDog(dog0);
        ourKennel.addDog(dog1);
        ourKennel.addDog(dog2);
        ourKennel.addDog(dog3);
        ourKennel.addDog(dog4);
        ourKennel.addDog(dog5);


        System.out.println(ourKennel.numOfDogs());
        System.out.println(ourKennel.hasDogs());
        // ourKennel.shutDownKennel();
        // ourKennel.removeDog(2);
        // ourKennel.getDog(2);
       // ourKennel.exchangeDog(2, dog5);

        ourKennel.kennel.contains(dog4);


        System.out.println(ourKennel.kennel.get(3).getName());
        // goes from the huge "Kennel" class into the specific ArrayList of 'kennel' to retrieve a dog within that created list, and applies the method '.getName' now to the dog that is specified
    }
}
