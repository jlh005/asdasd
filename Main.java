class IsA implements StringChecker {
  public checkString(String s) { return s.equals("a"); }
}

... in a test class ...
@Test
public void testSubtle() {
  List<String> s1 = Arrays.asList("a", "b", "a");
  List<String> s2 = Arrays.asList("a", "b");
  List<String> result1 = ListExamples.filter(s1, new IsA());
  List<String> result2 = ListExamples.filter(s2, new IsA());

  System.out.println(result1.size());
  System.out.println(result2.size());
  System.out.println(result1 == result2));
   
}
