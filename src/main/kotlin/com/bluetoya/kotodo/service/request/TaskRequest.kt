package com.bluetoya.kotodo.service.request

import java.time.LocalDateTime

class TaskRequest(
    var name: String,
    var taskGroup: String,
    var description: String,
    var isDone: Boolean,
    var dueDate: LocalDateTime
) {
}
