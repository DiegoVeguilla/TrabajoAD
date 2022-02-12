import {Schema,model} from 'mongoose'

//definicion de modelo de datos
const usuarioSchema = new Schema(
  {
    Nombreusuario: {
      type: String,
      require: true,
      unique: true,
      trim: true
    },
    Correo: {
      type: String,
      require: true,
      trim: true
    },
    Contrasenia: {
      type: String,
      require: true,
      trim: true
    },
    Telefono: String,
    Genero: String,
    Pais: String,
    Edad: String,
  },
  {
    timestamps: true,
    versionKey:false
  }
);
export default model('Usuario', usuarioSchema);