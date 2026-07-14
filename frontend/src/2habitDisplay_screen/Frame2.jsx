import HabitDisplayBox from './habitDisplay_screen/habit_box/HabitDisplayBox';
import BackToFrame1 from './BackToPrimary/BackToFrame1';
import '../0background_screen/Frame1.css';
import './Frame2.css';

function Frame2({ savedHabits, onBack }) {
  return (
    <div className="frame1">
      <BackToFrame1 onBack={onBack} />
      <div className="habits-grid">
        {savedHabits.map((habit, index) => (
          <HabitDisplayBox key={index} index={index} habitName={habit} />
        ))}
      </div>
    </div>
  );
}

export default Frame2;
