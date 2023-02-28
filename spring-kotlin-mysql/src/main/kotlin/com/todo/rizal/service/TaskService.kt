import com.todo.rizal.model.Task
import com.todo.rizal.repository.TaskRepository
import org.springframework.stereotype.Service

@Service
class TaskService(private val repository: TaskRepository) {

    fun findAll(): List<Task> = repository.findAll()

    fun findById(id: Long): Task? = repository.findById(id).orElse(null)

    fun save(todo: Task): Task = repository.save(todo)

    fun deleteById(id: Long) = repository.deleteById(id)
}
