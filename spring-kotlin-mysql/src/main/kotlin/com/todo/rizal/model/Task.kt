package com.todo.rizal.model
import javax.persistence.*

@Entity
@Table(name = "todo")

data class Task (
    @Id @GeneratedValue
    val id: Long? = null,
    val taskName: String,
    val description: String,
    val completed: Boolean = false
)