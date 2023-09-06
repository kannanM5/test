import {StyleSheet, Text, View, NativeModules, Button} from 'react-native';
import React from 'react';

const App = () => {
  const {TestModule} = NativeModules;

  const onPress = () => {
    TestModule.createCalendarEvent('testName', 'testLocation');
    console.log('onPress');
  };

  return (
    <View>
      <Text>App</Text>
      <Button
        title="Click to invoke your native module!"
        color="#841584"
        onPress={onPress}
      />
    </View>
  );
};

export default App;

const styles = StyleSheet.create({});
