package ch.hfict;

public class Person {
  private String first;
  private String last;
  
  public Person(String first, String last) {
    this.first = first;
    this.last =last;
  }

  public String getFirst() {
    return first;
  }

  public String getLast() {
    return last;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((first == null) ? 0 : first.hashCode());
    result = prime * result + ((last == null) ? 0 : last.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Person other = (Person) obj;
    if (first == null) {
      if (other.first != null)
        return false;
    } else if (!first.equals(other.first))
      return false;
    if (last == null) {
      if (other.last != null)
        return false;
    } else if (!last.equals(other.last))
      return false;
    return true;
  }

}
