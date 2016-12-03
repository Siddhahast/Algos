package Greedy;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Iterator;

/**
 * Created by siddhahastmohapatra on 03/12/16.
 */
public class SystemUtils {


    /*
    API for finding the set of prime numbers from a given list,
    using the greedy method paradigm
    1. Select an element from the list.
    2. Remove the element from the list to avoid iteration.
    3. Check whether the element is eligible to be in the list.
    4. If yes then add it to the solution.
    5. Return the solution model after iterating through all the elements.
     */
    public Set<Number> get_prime_numbers(Iterator<Number> iterator){
        Set<Number> primeSet = new HashSet<Number>();
        while(iterator.hasNext()){
            Integer i = (Integer) iterator.next();
            if(is_prime(i) && !primeSet.contains(i)){
                primeSet.add(i);
            }
        }
        return primeSet;
    }

    private boolean is_prime(Number num){
        /*
        Dummy condition to see whether the element or number is a prime number or not.
         */
        return false;
    }


    /*
    Need to sort the list as per the compareTo logic
    in the Comparable interface.
    Greedy approach to the container loading problem.
     */
    public Set<Container> ContainerLoading(List<Container> containers, int maxCapacity, int numberOfContainers, boolean[] x){

        Set<Container> containerSet = new HashSet<Container>();

        for(int i =0;i<containers.size();i++){
            x[i] = false;
        }

        int j = 0;
        while(j<=containers.size() && containers.get(j).weight<=maxCapacity){
            containerSet.add(containers.get(j));
            x[j] = true;
            maxCapacity = maxCapacity-containers.get(j).weight;
            j++;
        }
        return containerSet;
    }



}
