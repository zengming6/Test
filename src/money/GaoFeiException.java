package money;

// GaoFeiException 类继承 BaseException
public class GaoFeiException extends BaseException {

    // 默认构造方法
    public GaoFeiException() {
        super("GaoFei related error occurred");
    }

    // 带消息的构造方法
    public GaoFeiException(String message) {
        super(message);
    }

    // 带消息和原因的构造方法
    public GaoFeiException(String message, Throwable cause) {
        super(message, cause);
    }

    // 带原因的构造方法
    public GaoFeiException(Throwable cause) {
        super(cause);
    }
}
