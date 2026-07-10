import './AddHabitBox.css';

function AddHabitBox({ habitName, setHabitName }) {
  return (
    <div className="add-habit-container">
      <input 
        type="text" 
        className="add-habit-input" 
        value={habitName}
        onChange={(e) => setHabitName(e.target.value)}
        placeholder="Digite seu novo hábito..."
      />
    </div>
  );
}

export default AddHabitBox; 