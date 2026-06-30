# JavaPhilosophy

Here will be a code analysis as you read the book "The philosophy of java"
Each chapter will be in separate directories, and there will also be combined directories by chapters if necessary

Here is the state transition diagram for both Physical Hosts and Virtual Machines, explicitly annotated with the relevant assumptions from the previous modeling framework.

```mermaid
stateDiagram-v2
    direction TB

    %% ================= HOST STATES =================
    [*] --> Host_OFF
    Host_OFF --> Host_BOOTING: Power On & Init
    Host_BOOTING --> Host_ACTIVE: System Ready
    Host_ACTIVE --> Host_SHUTDOWN: Maintenance/Policy
    Host_SHUTDOWN --> Host_OFF: Power Down
    Host_ACTIVE --> Host_OFF: Critical Fault

    note right of Host_OFF
        **Linked Assumptions:**
        • `SD_01`: Fixed hardware capacity defines baseline.
        • `SM_03`: Linear power model governs energy draw during BOOTING/ACTIVE.
        • `SM_05`: Deterministic environment assumes no unexpected state jumps.
    end note

    note right of Host_ACTIVE
        **Linked Assumptions:**
        • `SS_02`: Feasibility logic triggers when VMs request resources.
        • `SS_04`: Sequential placement dependency updates host load state.
    end note

    %% ================= VM STATES =================
    [*] --> VM_OFF
    VM_OFF --> VM_BOOTING: Placement Request
    VM_BOOTING --> VM_ACTIVE: Resources Allocated
    VM_ACTIVE --> VM_SHUTDOWN: Task Execution Complete
    VM_SHUTDOWN --> VM_OFF: Termination
    VM_ACTIVE --> VM_OFF: Forced Kill
    VM_BOOTING --> VM_OFF: Allocation Failure

    note right of VM_OFF
        **Linked Assumptions:**
        • `SD_02`: Fixed VM demand dictates BOOTING requirements.
        • `SS_01`: One-to-one mapping enforces single-host binding.
        • `SD_04`: Random selection policy determines feasible target hosts.
    end note

    note right of VM_ACTIVE
        **Linked Assumptions:**
        • `M_08`: Performance metrics (MCT) are monitored here.
        • `SS_05`: Execution time depends on allocated CPU cores.
    end note
```

### Key Mapping Notes:
- **`SD_01` & `SM_03`**: Define the physical baseline and energy consumption profile, directly impacting the `OFF ↔ BOOTING` and `ACTIVE` transitions.
- **`SS_02` & `SS_04`**: Govern the `Host_ACTIVE` state's capacity to accept new VMs and how sequential placement alters load distribution.
- **`SD_02` & `SS_01`**: Constrain the `VM_OFF → VM_BOOTING` transition, ensuring static resource demands and single-host binding are respected.
- **`SD_04`**: Drives the stochastic nature of the `VM_BOOTING` phase, where the broker randomly selects a feasible host from the shrinking pool.
- **`M_08` & `SS_05`**: Active in the `VM_ACTIVE` state, where task execution time and completion metrics are calculated based on allocated cores and instruction counts.
