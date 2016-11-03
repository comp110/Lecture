package comp110.lecture19;

public class MenuItem {

  private String _name, _seating;

  private double _calories, _protein, _carbs, _fat;

  private boolean _organic, _vegetarian, _glutenFree, _vegan;

  public String getName() {
    return _name;
  }

  public String toString() {
    return _name;
  }

  public void setName(String name) {
    _name = name;
  }

  public String getSeating() {
    return _seating;
  }

  public void setSeating(String seating) {
    _seating = seating;
  }

  public double getCalories() {
    return _calories;
  }

  public void setCalories(double calories) {
    _calories = calories;
  }

  public double getProtein() {
    return _protein;
  }

  public void setProtein(double protein) {
    _protein = protein;
  }

  public double getCarbs() {
    return _carbs;
  }

  public void setCarbs(double carbs) {
    this._carbs = carbs;
  }

  public double getFat() {
    return _fat;
  }

  public void setFat(double fat) {
    _fat = fat;
  }

  public boolean isOrganic() {
    return _organic;
  }

  public void setOrganic(boolean organic) {
    _organic = organic;
  }

  public boolean isVegetarian() {
    return _vegetarian;
  }

  public void setVegetarian(boolean vegetarian) {
    _vegetarian = vegetarian;
  }

  public boolean isGlutenFree() {
    return _glutenFree;
  }

  public void setGlutenFree(boolean glutenFree) {
    _glutenFree = glutenFree;
  }

  public boolean isVegan() {
    return _vegan;
  }

  public void setVegan(boolean vegan) {
    _vegan = vegan;
  }

}
