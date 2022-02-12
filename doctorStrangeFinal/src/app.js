import express from "express";
import indexRoutes from "./routes/index.routes";
import exphbs from "express-handlebars";
import path from "path";
import morgan from "morgan";
import { engine } from "express-handlebars";

const app = express();

//vistas
app.set("views", path.join(__dirname, "views"));

//lenguaje que vamos a utilizar + implementacion de vista main y navbar
app.engine(
  ".hbs",
  engine({
    //nos ayuda a llegar a clases .hbs que estan en carpetas
    layoutsDir: path.join(app.get("views"), "layouts"),
    partialsDir:path.join(app.get("views"),"partials"),
    defaultLayout: "main",
    extname: ".hbs",
  })
);


app.set("view engine", ".hbs");

//middlewares
app.use(morgan('dev'));
app.use(express.urlencoded({extended:false}));
 
//Routes
app.use(indexRoutes);
export default app;
