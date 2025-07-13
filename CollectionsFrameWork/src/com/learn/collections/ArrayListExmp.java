package com.learn.collections;

import java.util.ArrayList;
import java.util.List;

class Employee {
    int id;
    String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return id + " - " + name;
    }
}


public class ArrayListExmp {

	public static void main(String[] args) {
		
		List<Employee> employees = new ArrayList<>();

	        // 2. Add elements
	        employees.add(new Employee(1, "Alice"));
	        employees.add(new Employee(2, "Bob"));
	        employees.add(new Employee(3, "Charlie"));
	        System.out.println("After add: " + employees);

	        // 3. Add at index
	        employees.add(1, new Employee(4, "David"));
	        System.out.println("After add at index 1: " + employees);

	        // 4. Get element
	        Employee emp = employees.get(2);
	        System.out.println("Get at index 2: " + emp);

	        // 5. Set element
	        employees.set(2, new Employee(5, "Eve"));
	        System.out.println("After set at index 2: " + employees);

	        // 6. Remove by index
	        employees.remove(1);
	        System.out.println("After remove index 1: " + employees);

	        // 7. Remove by object
	        employees.removeIf(e -> e.name.equals("Eve")); // OR pass object
	        System.out.println("After remove by condition: " + employees);

	        // 8. Contains
	        boolean exists = employees.contains(new Employee(1, "Alice")); // false (need equals override)
	        System.out.println("Contains Alice? " + exists);

	        // 9. Size
	        System.out.println("Size: " + employees.size());

	        // 10. Iterate
	        System.out.println("Iterating:");
	        for (Employee e : employees) {
	            System.out.println(e);
	        }

	        // 11. Clear
	        employees.clear();
	        System.out.println("After clear: " + employees);

	        // 12. isEmpty
	        System.out.println("Is empty? " + employees.isEmpty());
	}

}
