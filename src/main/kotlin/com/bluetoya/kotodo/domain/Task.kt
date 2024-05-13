package com.bluetoya.kotodo.domain

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id

@Entity
class Task(@Id @GeneratedValue var id: Long)


