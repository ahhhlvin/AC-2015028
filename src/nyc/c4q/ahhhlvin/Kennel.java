package nyc.c4q.ahhhlvin;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by alvin2 on 3/28/15.
 * Alvin Kuang
 * C4Q Access Code 2.1
 */



public class Kennel {
    // 'kennel' is a box variable of "TYPE" ArrayList
    ArrayList<Dogs> kennel;


    public Kennel() {
        // creates an object kennel (data structure) that passes a "NEW" ArrayList to EACH kennel object created !
        this.kennel = new ArrayList<Dogs>();


        /* ArrayList<Dogs> this.kennel = new ArrayList<Dogs>(); */


    }


    public void addDog(Dogs newDog) {
        this.kennel.add(newDog);

    }

    public int numOfDogs() {
        int size = this.kennel.size();

        return size;
    }

    public boolean hasDogs() {
        return !this.kennel.isEmpty();
    }

    public void shutDownKennel() {
        System.out.println("You have been shut down! :(");
        this.kennel.clear();
    }

    public void removeDog(int dogIndex) {
        this.kennel.remove(dogIndex);
    }

   /* protected void putDogstoSleep(int start, int stop) {
        this.kennel.removeRange(start, stop);
    } */

    public void getDog(int dogInd) {

        if (this.kennel.size() < dogInd) {
            System.out.println("You cannot take this dog because it does not exist in the Kennel!");
            return;
        } else {
            System.out.println(this.kennel.get(dogInd));
        }
    }

    public void exchangeDog(int index, Dogs doggie) {
        this.kennel.set(index, doggie);

    }


    public boolean isDogInKennel(Dogs doggie) {
        return this.kennel.contains(doggie);
    }

    public int indexOfDog(Dogs doge) {
        if (this.kennel.contains(doge)) {
            return this.kennel.indexOf(doge);
        } else {
            return -1;
        }
    }

    public Iterator returnIterator(ArrayList kenList) {
        Iterator<Dogs> dogIter = kenList.iterator();
        return dogIter;
    }




}
