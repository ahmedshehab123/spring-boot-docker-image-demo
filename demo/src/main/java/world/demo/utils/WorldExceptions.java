package world.demo.utils;

public class WorldExceptions extends RuntimeException {

    private static final long serialVersionUID = 1L;
    private String errorCode;
    private String errorMessage;

    public WorldExceptions(String errorCode) {
        super();
        this.errorCode = errorCode;
    }

    public WorldExceptions(String errorCode, String errorMessage) {
        super();
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

}
