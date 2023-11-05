package gam.trainingcourse.annht2_mock_final_fresherandroid_07

import android.app.Application

open class BaseApplication: Application() {
    companion object {
        lateinit var instance: BaseApplication
    }
}