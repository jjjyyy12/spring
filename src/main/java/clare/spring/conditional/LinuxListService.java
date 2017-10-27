package clare.spring.conditional;

/**
 *  
 */
public class LinuxListService implements IListService {
    public String showListCmd() {
        return "ls";
    }
}
