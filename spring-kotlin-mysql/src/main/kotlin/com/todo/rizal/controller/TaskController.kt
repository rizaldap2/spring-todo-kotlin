import com.todo.rizal.model.Task
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/todos")
class TodoController(private val service: TaskService) {

    @GetMapping
    fun findAll() = service.findAll()

    @GetMapping("/{id}")
    fun findById(@PathVariable id: Long) = service.findById(id)

    @PostMapping
    fun save(@RequestBody task: Task) = service.save(task)

    @DeleteMapping("/{id}")
    fun deleteById(@PathVariable id: Long) = service.deleteById(id)
}
