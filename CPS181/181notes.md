# 181 Notes

### For each loops

```java
int[] array = {1, 2, 3, 4, 5};

for (int i : array) System.out.print(i);
```

Output:

```
12345
```

### [printf](https://www.cs.colostate.edu/~cs160/.Summer16/resources/Java_printf_method_quick_reference.pdf)

```java
String sVal = "Hello Neptune!";
float fVal = 1.2345f;

System.out.printf("%.5s World! 1 + 0.2 = %1.1f", sVal, fVal);
```

Output:

```
Hello World! 1 + 0.2 = 1.2
```

| Abbreviation   | Meaning        |
| :------------- | :------------- |
| \t             | Tab            |
| \n             | New line       |
