package clare.spring.conditional;

/**
 * 
 */
public class WindowsListService implements IListService{
    public String showListCmd() {
        return "dir";
    }
}
