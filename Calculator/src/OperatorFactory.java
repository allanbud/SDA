import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/***********implement a factory class which returns instances of Operation based on the given operator**/

public class OperatorFactory {
    static Map<String, PostFix.Operation> operationMap = new HashMap<>();
    static {
        operationMap.put("+", new PostFix.Addition());
        operationMap.put("-", new PostFix.Subtraction());
        operationMap.put("*", new PostFix.Multiplication());
        operationMap.put("/", new PostFix.Division());
    }

    public static Optional<PostFix.Operation> getOperation(String operator) {
        return Optional.ofNullable(operationMap.get(operator));
    }
}
