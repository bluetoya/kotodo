package com.bluetoya.kotodo.service.response

import java.time.LocalDateTime

class TaskResponse(
    var id: Long,
    var name: String,
    var taskGroup: String,
    var description: String,
    var isDone: Boolean,
    var dueDate: LocalDateTime
) {
}
