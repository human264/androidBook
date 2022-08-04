package fastcampus.aop.part3.myapplication

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel
import java.util.*

class CrimeListViewModel : ViewModel() {

    private val crimeRepository = CrimeRepository.get()

    val crimeListLiveData = crimeRepository.getCrimes()

}