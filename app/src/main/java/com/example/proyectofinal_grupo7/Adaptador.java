package com.example.proyectofinal_grupo7;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adaptador extends RecyclerView.Adapter<Adaptador.ViewHolder> {
    private ArrayList<Formulario> listaFormulario;

    public Adaptador(ArrayList<Formulario> listaFormulario) {
        this.listaFormulario = listaFormulario;
    }

    @NonNull
    @Override
    public Adaptador.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.formato_form,null,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Adaptador.ViewHolder holder, int position) {
        holder.asignarDatos(listaFormulario.get(position));
    }

    @Override
    public int getItemCount() {
        return listaFormulario.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvID, tvNombre, tvMes, tvAnio, tvEstado;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvID=itemView.findViewById(R.id.tvID);
            tvNombre=itemView.findViewById(R.id.tvNombre);
            tvMes=itemView.findViewById(R.id.tvMes);
            tvAnio=itemView.findViewById(R.id.tvAño);
            tvEstado=itemView.findViewById(R.id.tvEstado);
        }
        public void asignarDatos(Formulario formulario) {
            tvID.setText("ID: "+formulario.getId());
            tvNombre.setText("NOMBRE: "+formulario.getNombre());
            tvMes.setText("MES: "+formulario.getMes());
            tvAnio.setText("AÑO: "+formulario.getAnio());
            tvEstado.setText("ESTADO: "+formulario.getEstado());
        }
    }
}
