package elrizo.com.facebook;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class PublicacionAdapter extends RecyclerView.Adapter<PublicacionAdapter.ViewHolder> {


    public List<publicacionP> publicacion;
    private Context context;

    public PublicacionAdapter(List<publicacionP> publicacion) {
        this.publicacion = publicacion;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

       View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_publicacion,parent,false);
       context = parent.getContext();
       return  new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
    publicacionP pub = publicacion.get(position);
    holder.lblnombre.setText(pub.getNombre());
    holder.lblnombre.setText(pub.getApellido());



    }

    @Override
    public int getItemCount() {
        return publicacion.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private View view;
        private TextView lblnombre;
        private TextView lblApellido;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            lblnombre = itemView.findViewById(R.id.lblnombre);
            lblApellido = itemView.findViewById(R.id.lblapellido);
            this.view = itemView;
        }
    }
}

