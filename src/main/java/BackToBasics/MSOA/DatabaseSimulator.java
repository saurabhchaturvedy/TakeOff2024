package BackToBasics.MSOA;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class DatabaseSimulator {


    Map<String, String> permanentStorage;
    Stack<Map<String, String>> transactionalStack;


    DatabaseSimulator() {

        this.permanentStorage = new HashMap<>();
        this.transactionalStack = new Stack<>();
    }


    public void begin() {

        transactionalStack.push(new HashMap<>());
    }

    public int count() {
        return permanentStorage.size();
    }


    public void set(String key, String value) throws NoActiveTransactionException {

        if (transactionalStack.isEmpty()) {
            throw new NoActiveTransactionException("Unable to set : No active transaction");
        }

        transactionalStack.peek().put(key, value);
    }


    public String get(String key) {

        if (transactionalStack.isEmpty()) {
            return permanentStorage.get(key);
        }
        for (int i = transactionalStack.size() - 1; i >= 0; i--) {
            Map<String, String> transaction = transactionalStack.get(i);
            if (transaction.containsKey(key)) {
                return transaction.get(key);
            }
        }
        return permanentStorage.get(key);
    }

    public void commit() throws NoActiveTransactionException {
        if (transactionalStack.isEmpty()) {
            throw new NoActiveTransactionException("Error ::");
        }

        Map<String, String> finalChanges = transactionalStack.get(0);
        for (int i = 1; i < transactionalStack.size(); i++) {
            finalChanges.putAll(transactionalStack.get(i));
        }

        permanentStorage.putAll(finalChanges);
        transactionalStack.clear();
    }

    public void rollback() throws NoActiveTransactionException {
        if (transactionalStack.isEmpty()) {
            throw new NoActiveTransactionException("Error");
        }
        transactionalStack.pop();
    }

    public static void main(String[] args) {

    }
}
