package comp110.lecture09;

public class TwitterPost {

  private String _message;
  private int _likes;

  public TwitterPost(String message) {
    _message = message;
    _likes = 0;
  }

  public void isLikedAFewTimes() {
    _likes = _likes + 3;
  }

  public void unliked() {
    _likes = _likes - 1;
  }

  public int getLikes() {
    return _likes;
  }

  public String getMessage() {
    return _message;
  }

}