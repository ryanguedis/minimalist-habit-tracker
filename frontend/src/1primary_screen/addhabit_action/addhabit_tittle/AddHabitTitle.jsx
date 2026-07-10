import './AddHabitTitle.css';

/**
 * AddHabitTitle
 * Título acima da barra de adição.
 * "Adicione um novo hábito" — "hábito" em bold italic.
 * Usa o SVG original fornecido como referência tipográfica fiel.
 */
function AddHabitTitle() {
  return (
    <div className="add-habit-title-wrapper">
      <p className="add-habit-title">
        Cadastre um novo <strong>hábito</strong>
      </p>
    </div>
  );
}

export default AddHabitTitle;
 