import { useState } from 'react';
import Frame1 from './0background_screen/Frame1.jsx';
import Frame2 from './2habitDisplay_screen/Frame2.jsx';

function App() {
  const [habitCreated, setHabitCreated] = useState(false);
  const [habitName, setHabitName] = useState('');
  const [savedHabits, setSavedHabits] = useState([]);

  const handleAction = () => {
    if (habitName.trim()) {
      setSavedHabits([...savedHabits, habitName.trim()]);
      setHabitCreated(true);
      setHabitName(''); // Limpar para o próximo cadastro
    }
  };

  const handleBack = () => {
    setHabitCreated(false);
  };

  return (
    <>
      {!habitCreated ? (
        <Frame1 
          onAction={handleAction} 
          habitName={habitName} 
          setHabitName={setHabitName} 
        />
      ) : (
        <Frame2 savedHabits={savedHabits} onBack={handleBack} />
      )}
    </>
  );
}

export default App;
