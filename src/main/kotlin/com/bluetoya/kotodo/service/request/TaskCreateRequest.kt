package com.bluetoya.kotodo.service.request

import org.jetbrains.annotations.NotNull
import java.time.LocalDateTime

class TaskCreateRequest(
    @NotNull var name: String,
    var taskGroup: String,
    var description: String,
    var dueDate: LocalDateTime
) {
}
