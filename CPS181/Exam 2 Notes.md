# Exam 2 Notes

## throwing exception

in a function, instead of `return`ing a value, throw exception.

```java

throw new Exception("Target not found");

```

## try catch

```java

try {
}
catch (Exception e) {
	System.out.println(e.getMessage());
}

```

## Sorting objects of different types

```java

List<Animal> aList = new ArrayList<>();

```

```java

List<Mammal> mList = new ArrayList<>();
for (Animal a : aList) {
	if (a instance of Mammal)
		mList.add((Mammal)a);
}
Collections.sort(mList);

```

## `?` operator

the `?` operator will return this or that depending on the condition.

instead of:

```java

if (a > b) max = a;
else max = b;

```

do this:

```java

max = (a > b) ? a : b;

```
