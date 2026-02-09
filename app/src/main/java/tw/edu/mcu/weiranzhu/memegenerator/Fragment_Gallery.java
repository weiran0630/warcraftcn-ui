package tw.edu.mcu.weiranzhu.memegenerator;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;

import androidx.fragment.app.Fragment;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Fragment_Gallery#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Fragment_Gallery extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Fragment_Gallery() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Fragment_Gallery.
     */
    // TODO: Rename and change types and number of parameters
    public static Fragment_Gallery newInstance(String param1, String param2) {
        Fragment_Gallery fragment = new Fragment_Gallery();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /*if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }*/
    }

    GridView gridView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment__gallery, container, false);
        gridView = rootView.findViewById(R.id.gridview);
        gridView.setAdapter(new ImageAdapter(getActivity()));

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                int item_pos = position;
                Intent intent = new Intent(getActivity(), MemeCreate.class);
                intent.putExtra("id", item_pos);
                startActivity(intent);
            }
        });
        return rootView;
    }

    public Integer[] mThumbIds = {
            R.drawable.meme1, R.drawable.meme2, R.drawable.meme3,
            R.drawable.meme4, R.drawable.meme5, R.drawable.meme6,
            R.drawable.meme7, R.drawable.meme8, R.drawable.meme9,
            R.drawable.meme10, R.drawable.meme11, R.drawable.meme12,
            R.drawable.meme13, R.drawable.meme14, R.drawable.meme15,
            R.drawable.meme16, R.drawable.meme17, R.drawable.meme18,
            R.drawable.meme19, R.drawable.meme20, R.drawable.meme21,
            R.drawable.meme22, R.drawable.meme23, R.drawable.meme24,
            R.drawable.meme25, R.drawable.meme26, R.drawable.meme27
    };
}
