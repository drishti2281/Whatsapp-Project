package com.example.whatsappproject

import android.net.wifi.p2p.WifiP2pManager.ChannelListener
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.Menu
import android.view.MenuInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.whatsappproject.databinding.FragmentStatusBinding
import kotlinx.coroutines.channels.Channel

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [StatusFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class StatusFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null
    lateinit var binding : FragmentStatusBinding

    var channellist : MutableList<ChannelsClass> = mutableListOf(
        ChannelsClass(R.drawable.img_3,"Drishuu","Hello","2:00 AM"))
    var findChannellist : MutableList<FindchannelsClass> = mutableListOf(
        FindchannelsClass(R.drawable.img_6,"Finance"),
        FindchannelsClass(R.drawable.img_7,"News"),
        FindchannelsClass(R.drawable.img_8,"Total Gaming"))

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentStatusBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //Returns an empty new MutableList.
        val Status : MutableList<StatusClass> = mutableListOf()
        //Returns a new MutableList with the given elements.
        Status.add(StatusClass(R.drawable.img_1,"Ritika",))
        Status.add(StatusClass(R.drawable.img_3,"Navpreet"))
        Status.add(StatusClass(R.drawable.img_4,"Prabh"))
        Status.add(StatusClass(R.drawable.img_5,"Anshika"))
        binding.rvStatus.adapter = StatusAdapter(Status)
        binding.rvStatus.layoutManager = LinearLayoutManager(requireContext(),LinearLayoutManager.HORIZONTAL,false)

        binding.rvChannels.adapter =  ChannelsAdapter(channellist)
        binding.rvChannels.layoutManager =
            LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)

        binding.rvFindChannels.adapter = FindchannelsAdapter(findChannellist)
        binding.rvFindChannels.layoutManager =
            LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)

    }
    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.status_menu, menu)
        return super.onCreateOptionsMenu(menu,inflater)
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment StatusFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            StatusFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}