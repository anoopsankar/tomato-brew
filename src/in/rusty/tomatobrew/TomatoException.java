package in.rusty.tomatobrew;

public class TomatoException extends Exception {

    private static final long serialVersionUID = 1253318111007929023L;

    public TomatoException(Exception e) {
        super(e);
    }
    
}
