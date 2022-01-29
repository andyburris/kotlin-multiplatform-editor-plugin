package com.github.andyburris.kotlinmultiplatformeditorplugin.services

import com.intellij.openapi.project.Project
import com.github.andyburris.kotlinmultiplatformeditorplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
