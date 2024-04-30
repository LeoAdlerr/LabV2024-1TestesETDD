package br.edu.fatec.sjc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NumberAscOrder {
    private CustomStack<Number> customStack;

    public NumberAscOrder(CustomStack<Number> customStack) {
        this.customStack = customStack;
    }

    public List<Integer> sort() throws StackEmptyException {
        List<Integer> sortedNumbers = new ArrayList<>();

        while (!customStack.isEmpty()) {
            sortedNumbers.add((Integer) customStack.pop());
        }

        Collections.sort(sortedNumbers);

        return sortedNumbers;
    }

}
