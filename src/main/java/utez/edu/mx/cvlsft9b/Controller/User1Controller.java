@RestController
@RequestMapping("/api/user1")

public class User1Controller{
    @GetMapping("")
    public String getMessage(){
        return "Hello desde user1!";
    }
}